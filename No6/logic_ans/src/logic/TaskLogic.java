package logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import dataaccess.TaskDataAccess;
import model.Task;

public class TaskLogic {
    private static final TaskDataAccess TASK_DATA_ACCESS = new TaskDataAccess();
    private static final BufferedReader READER = new BufferedReader(
            new InputStreamReader(System.in, Charset.forName("SHIFT-JIS")));

    public void showTaskList() {
        List<Task> tasks = TASK_DATA_ACCESS.findAll();

        System.out.println("- タスクの一覧を表示します -");

        if (tasks.isEmpty()) {
            System.out.println("現在のタスクはありません");
            System.out.println("必要であればタスクを追加してください\n");
            return;
        }

        tasks.forEach(n -> {
            if (!n.getStatus().equals("対応済み")) {
                System.out.print(n.getId() + "|");
                System.out.print(n.getStatus() + "|");
                System.out.print(n.getTitle() + "|");
                System.out.print(n.getCreateAt() + "|");
                System.out.print(n.getDueDate() + "|");
                System.out.println();
            }
        });
    }

    public void createTask() throws Exception {
        System.out.println("タスクを入力してください");
        System.out.print("入力: ");
        String title = READER.readLine();
        Task lastTask = TASK_DATA_ACCESS.findAll().getLast();

        Task task = new Task(lastTask.getId() + 1, title);
        TASK_DATA_ACCESS.save(task);

        System.out.println("新規タスクを追加しました");
    }

    public void updateTask() throws Exception {
        System.out.println("編集するタスクIDを入力してください");
        Task task = null;
        while (true) {
            System.out.print("入力: ");
            int id = Integer.parseInt(READER.readLine());
            task = TASK_DATA_ACCESS.findById(id);
            if (task == null) {
                System.out.println("存在するタスクIDを指定してください。");
                continue;
            } else
                break;
        }
        System.out.println("編集したい内容を選んでください。");
        System.out.println("1: ステータス 2: タイトル: 3: 期限");
        String update = "";
        while (true) {
            System.out.print("入力: ");
            update = READER.readLine();
            if (!(update.equals("1") || update.equals("2") || update.equals("3"))) {
                System.out.println("1,2,3のいずれかを入力してください。");
                continue;
            } else
                break;
        }
        if (update.equals("1")) {
            task.setStatus(updateTaskStatus());
        } else if (update.equals("2")) {
            task.setTitle(updateTaskTitle());
        } else {
            task.setDueDate(updateDueDate());
        }
        TASK_DATA_ACCESS.update(task);

        System.out.println("タスクを更新しました");
    }

    public String updateTaskStatus() throws Exception {
        System.out.println("変更するステータスを選択してください");
        System.out.println("1: 対応中, 2: 保留, 3: 対応済み");
        String input = READER.readLine();
        String status;

        switch (input) {
            case "1":
            case "対応中":
                status = "対応中";
                break;
            case "2":
            case "保留":
                status = "保留";
                break;
            case "3":
            case "対応済み":
                status = "対応済み";
                break;
            default:
                System.out.println("選択肢1~3を入力し直してください");
                status = updateTaskStatus();
                break;
        }
        return status;
    }

    public String updateTaskTitle() throws Exception {
        System.out.println("変更後のタスクを入力してください");
        System.out.print("入力: ");

        String title = READER.readLine();
        return title;
    }

    public LocalDate updateDueDate() throws Exception {
        System.out.println("変更後の期限を入力してください");
        System.out.print("入力: ");

        LocalDate dueDate = LocalDate.parse(READER.readLine());
        return dueDate;
    }

    // 最後のタスクIDに+1した数値を取得する
    public int getNextTaskId() {
        List<Task> tasks = TASK_DATA_ACCESS.findAll();
        int count = tasks.size();
        int nextId = 1;

        if (count != 0) {
            Optional<Task> opt = tasks.stream()
                    .skip(tasks.stream().count() - 1)
                    .findFirst();
            nextId += opt.get().getId();
        }

        return nextId;
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

import logic.TaskLogic;

public class App {
    private static final TaskLogic TASK_LOGIC = new TaskLogic();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        System.out.println("タスク管理システムへようこそ");
        while (flag) {
            System.out.println("機能を選択してください");
            System.out.println("1:タスク一覧, 2:タスク追加, 3:タスク編集, 4:終了");
            System.out.print("入力してください: ");
            String input = br.readLine();

            switch (input) {
                case "1":
                    TASK_LOGIC.showTaskList();
                    break;
                case "2":
                    TASK_LOGIC.createTask();
                    break;
                case "3":
                    TASK_LOGIC.updateTask();
                    break;
                case "4":
                    System.out.println("終了します");
                    flag = false;
                default:
                    System.out.println("入力内容をご確認ください");
                    break;
            }
        }
    }
}

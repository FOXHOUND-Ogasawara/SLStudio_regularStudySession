package dataaccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Task;

public class TaskDataAccess {
    private static final String FILE_NAME = "resources\\task.csv";

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length != 5) {
                    continue;
                }

                Task task = new Task(
                        Integer.parseInt(values[0]),
                        values[1],
                        values[2],
                        LocalDate.parse(values[3]),
                        LocalDate.parse(values[4]));

                tasks.add(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tasks;
    }

    public Task findById(int id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                if (values.length != 5) {
                    continue;
                }

                if (id == Integer.parseInt(values[0])) {
                    return new Task(
                            id,
                            values[1],
                            values[2],
                            LocalDate.parse(values[3]),
                            LocalDate.parse(values[4]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void save(Task task) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String line = createLine(task);
            bw.newLine();
            bw.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(Task updateTask) {
        List<Task> tasks = findAll();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bw.write("Id,Status,Title,CreatedAt,DueDate\n");
            String line;

            for (Task task : tasks) {
                if (task.getId() == updateTask.getId()) {
                    line = createLine(updateTask);
                } else {
                    line = createLine(task);
                }
                bw.write(line);
                bw.newLine();
            }
            ;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String createLine(Task task) {
        return task.getId() + ","
                + task.getStatus() + ","
                + task.getTitle() + ","
                + task.getCreateAt() + ","
                + task.getDueDate();
    }
}

package model;

import java.time.LocalDate;

public class Task {
    private int id;
    private String status;
    private String title;
    private LocalDate dueDate;
    private LocalDate createdAt;

    public Task(int id, String title) {
        this.id = id;
        this.status = "新規";
        this.title = title;
        this.createdAt = LocalDate.now();
        this.dueDate = this.createdAt.plusDays(3);
    }

    public Task(int id, String status, String title, LocalDate createdAt, LocalDate dueDate) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDueDate(LocalDate duDate) {
        this.dueDate = duDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getCreateAt() {
        return createdAt;
    }
}
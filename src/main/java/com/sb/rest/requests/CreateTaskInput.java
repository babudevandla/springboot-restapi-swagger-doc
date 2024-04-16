package com.sb.rest.requests;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

import com.sb.rest.entities.Task;
import com.sb.rest.entities.TaskStatusEnum;

@Schema(title = "CreateTaskInput", description = "Parameters required to create a task", required = true)
public record CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
    public Task toTask() {
        Task task = new Task();

        task.setName(name)
            .setTaskDesc(description)
            .setStatus(status)
            .setDueDate(dueDate);

        return task;
    }
}

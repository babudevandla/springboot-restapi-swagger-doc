package com.sb.rest.requests;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

import com.sb.rest.entities.TaskStatusEnum;

@Schema(title = "UpdateTaskInput", description = "Parameters required to update a task", required = true)
public record UpdateTaskInput(TaskStatusEnum status, Date dueDate) {

}

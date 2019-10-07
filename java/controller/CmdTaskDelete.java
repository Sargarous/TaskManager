package by.it.kruglenja.TaskManager.java.controller;

import by.it.kruglenja.TaskManager.java.dao.Dao;

import javax.servlet.http.HttpServletRequest;

public class CmdTaskDelete implements Cmd {
    @Override
    public Action execute(HttpServletRequest req) throws Exception {
        Dao dao = Dao.getDao();
        if (Form.isPost(req)) {
            long taskId = Form.getLongById(req, "id");
            String taskName = Form.getStringById(req, "taskNameFromTable");
            if (dao.task.delete(taskId)) {
                String message = "Task " + taskName + " was successfully deleted";
                req.setAttribute("tableMessage", "Список задач пуст");
            }
        }
        return Action.TASKPAGE;
    }
}

package com.example.todoapp.Mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.todoapp.entity.Task;

@Mapper
public interface TaskMapper {
    public List<Task> selectAll();

    public void add(Task task);

    public void update(Task task);
}

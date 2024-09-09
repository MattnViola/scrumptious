import React, { useState } from 'react';
import TaskList from './TaskList';
import './Layout.css';

function Layout() {
  const [tasks, setTasks] = useState([]);
  const [newTask, setNewTask] = useState('');

  const handleInputChange = (e) => {
    setNewTask(e.target.value);
  };

  const handleFormSubmit = (e) => {
    e.preventDefault();
    if (newTask.trim()) {
      const newTaskObj = {
        id: tasks.length + 1,
        name: newTask,
        status: 'To-Do'
      };
      setTasks([...tasks, newTaskObj]);
      setNewTask('');
    }
  };

  const handleTaskDelete = (id) => {
    setTasks(tasks.filter(task => task.id !== id));
  };

  return (
    <div className="layout">
      <h1>Task Management System</h1>

      {/* Task Form */}
      <form onSubmit={handleFormSubmit}>
        <input
          type="text"
          placeholder="Enter new task"
          value={newTask}
          onChange={handleInputChange}
        />
        <button type="submit">Add Task</button>
      </form>

      {/* Task List */}
      <TaskList tasks={tasks} onDelete={handleTaskDelete} />
    </div>
  );
}

export default Layout;

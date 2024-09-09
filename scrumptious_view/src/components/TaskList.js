import React from 'react';

function TaskList({ tasks, onDelete }) {
  return (
    <div>
      <h2>Your Tasks</h2>
      <ul>
        {tasks.map(task => (
          <li key={task.id}>
            {task.name} - {task.status}
            <button onClick={() => onDelete(task.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TaskList;

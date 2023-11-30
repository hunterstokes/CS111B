package Midterm;

class ToDoItem {
  private String description;
  private int priority;
  private boolean isCompleted;

  public ToDoItem(String description, int priority, boolean isCompleted) {
    this.description = description;
    this.priority = priority;
    this.isCompleted = isCompleted;
  }

  public ToDoItem(String description, int priority) {
    this.description = description;
    this.priority = priority;
    this.isCompleted = false;
  }

  public ToDoItem(String description) {
    this.description = description;
    this.priority = 0;
    this.isCompleted = false;
  }

  public String getDescription(){
    return this.description;
  }
  
  public int getPriority() {
    return this.priority;
  }

  public boolean getIsCompleted() {
    return this.isCompleted;
  }
  public boolean equalsTo(ToDoItem o) {
    if (this.description.equals(o.description) && this.priority == o.priority && this.isCompleted == o.isCompleted) {
      return true;
    } else {
      return false;
    }
  }
}
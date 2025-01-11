package assets.src;

public class Task {
        private String description;
        private boolean isCompleted;

        public Task(String description, boolean isCompleted) {
            this.description = description;
            this.isCompleted = false; //New tasks are pending by default
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        //Mark the task as completed
        public void markAsCompleted(){
            isCompleted = true;
        }

        public void markAsUncompleted(){
            isCompleted = false;
        }

        @Override
        public String toString() {
            return (isCompleted ? "[✔]" : "[ ]") + " " + description;
        }
}
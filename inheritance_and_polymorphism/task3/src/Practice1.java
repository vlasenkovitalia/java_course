static class SuperClass {
    // Поле суперкласса
    String message;

    // Конструктор суперкласса
    public SuperClass(String msg) {
        this.message = msg;
    }

    // Метод суперкласса
    public void display() {
        IO.println("Message from SuperClass: " + message);
    }
}

static class SubClass extends SuperClass {
    // Поле подкласса
    String additionalMessage;

    // Конструктор подкласса
    public SubClass(String msg, String additionalMsg) {
        // Обращение к конструктору суперкласса
        super(msg);
        this.additionalMessage = additionalMsg;
    }

    // Метод для отображения сообщений
    public void showMessages() {
        // Доступ к методу суперкласса
        super.display();
        IO.println("Additional Message from SubClass: " + additionalMessage);
    }

    // Метод для изменения поля суперкласса
    public void updateMessage(String newMsg) {
        this.message = newMsg;  // Доступ к полю суперкласса
    }

    // Метод для отображения обновленного сообщения
    public void displayUpdatedMessage() {
        IO.println("Updated Message from SuperClass: " + message);
    }
}


void main() {
    SubClass subClass = new SubClass("Hello from SuperClass!", "Hello from SubClass!");
    subClass.showMessages();

    // Изменяем поле суперкласса
    subClass.updateMessage("New message from SuperClass!");

    // Отображаем обновленное сообщение
    subClass.displayUpdatedMessage();
}

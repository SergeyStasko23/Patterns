package pattern.behavioral.mediator;

/*
    Mediator - посредник.

    Обеспечивает слабую связанность системы,
    избавляя объекты от необходимости явно ссылаться друг на друга и,
    позволяя тем самым, независимо изменять взаимодействия между ними.
 */
public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm User #1");
        admin.sendMessage("I'm Admin");
    }
}

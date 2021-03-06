package bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class JCBot24 extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {


        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            System.out.println("New message catched : "+update.getMessage().getFrom()+ "/"+update.getMessage().getDate()+" : "+update.getMessage().getText() );
        }
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        return "jcgca_bot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "654076221:AAFpSWNdN9CZ2tmc9f88W72EpoVsAp2b3S8";
    }


}
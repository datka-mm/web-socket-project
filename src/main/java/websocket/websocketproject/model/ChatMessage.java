package websocket.websocketproject.model;

import lombok.*;
import websocket.websocketproject.enums.MessageType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType messageType;
}

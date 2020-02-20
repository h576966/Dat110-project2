package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	private String topic;
	private String message;
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	public PublishMsg(String name, String topic, String message) {
		super(MessageType.PUBLISH, name);
		this.topic = topic;
		this.message = message;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Message [topic=" + topic + ", type=" + getType() + ", user=" + getUser() + ", message=" + message + "]";
	}

}

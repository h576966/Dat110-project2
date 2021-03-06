package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
	private String topic;
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	public UnsubscribeMsg(String name, String topic) {
		super(MessageType.UNSUBSCRIBE, name);
		this.topic = topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	@Override
	public String toString() {
		return "Message [topic=" + topic + ", type=" + getType() + ", user=" + getUser() + "]";
	}

}

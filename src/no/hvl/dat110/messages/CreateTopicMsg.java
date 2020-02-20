package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	private String topic;

	// TODO:
	// Implement objectvariables, constructor, get/set-methods, and toString method
	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
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

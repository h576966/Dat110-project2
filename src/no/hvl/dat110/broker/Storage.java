package no.hvl.dat110.broker;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import no.hvl.dat110.common.TODO;
import no.hvl.dat110.common.Logger;
import no.hvl.dat110.messagetransport.Connection;

public class Storage {

	protected ConcurrentHashMap<String, Set<String>> subscriptions;
	protected ConcurrentHashMap<String, ClientSession> clients;

	public Storage() {
		subscriptions = new ConcurrentHashMap<String, Set<String>>();
		clients = new ConcurrentHashMap<String, ClientSession>();
	}

	public Collection<ClientSession> getSessions() {
		return clients.values();
	}

	public Set<String> getTopics() {

		return subscriptions.keySet();

	}

	public ClientSession getSession(String user) {

		ClientSession session = clients.get(user);
		return session;
	}

	public Set<String> getSubscribers(String topic) {

		return (subscriptions.get(topic));

	}

	public void addClientSession(String user, Connection connection) {
		//Todo
		ClientSession session = new ClientSession(user, connection);
		clients.put(user, session);

	}

	public void removeClientSession(String user) {
		//Todo
		clients.remove(user);

	}

	public void createTopic(String topic) {
		//Todo
		subscriptions.put(topic, new HashSet<>());
	}

	public void deleteTopic(String topic) {
		//Todo
		subscriptions.remove(topic);

	}

	public void addSubscriber(String user, String topic) {
		//Todo
		if (subscriptions.containsKey(topic)) {
			subscriptions.get(topic).add(user);
		}

	}

	public void removeSubscriber(String user, String topic) {
		//Todo
		if (subscriptions.containsKey(topic)) {
			subscriptions.get(topic).remove(user);
		}
	}
}

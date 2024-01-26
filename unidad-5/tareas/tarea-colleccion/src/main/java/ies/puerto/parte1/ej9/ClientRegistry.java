package ies.puerto.parte1.ej9;

import java.util.List;

public class ClientRegistry {
    /**
     * Properties
     */
    private List<Client> clients;

    /**
     * Default constructor
     */
    public ClientRegistry() {}

    /**
     * Constructor with list parameter
     * @param clients to be registered
     */
    public ClientRegistry(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Getters and setters
     */

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Adds a client to the list
     * @param client
     */
    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    /**
     * Searches clients by number
     * @param clientNumber self-explanatory
     * @return client
     */
    public Client searchClient(String clientNumber) {
        Client clientSearch = new Client("", clientNumber);
        return searchClient(clientSearch);
    }

    /**
     * Searches client
     * @param client self-explanatory
     * @return client
     */
    public Client searchClient(Client client) {
        for (Client clientElement : clients) {
            if (clientElement.equals(client)) {
                return clientElement;
            }
        }
        return null;
    }

    /**
     * Updates balance of a given client
     * @param clientNumber self-explanatory
     * @param amount added or subtracted
     */
    public void makeTransaction(String clientNumber, float amount) {
        Client updatedClient = new Client("", clientNumber);
        if (!clients.contains(updatedClient)) {
            return;
        }
        int clientPosition = clients.indexOf(updatedClient);
        updatedClient = searchClient(updatedClient);
        updatedClient.updateBalance(amount);
        clients.set(clientPosition, updatedClient);
    }
}

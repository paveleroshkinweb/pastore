package org.pastore.db.store;

import org.pastore.db.IDatabase;
import org.pastore.db.value.DBValue;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private IDatabase database;

    private int number;

    private Map<String, DBValue> store;

    public Store(Map<String, DBValue> store) {
        this.store = store;
    }

    public Store(final IDatabase database, final int number) {
        this.database = database;
        this.store = new ConcurrentHashMap<>();
        this.number = number;
    }

    public DBValue getDBValueByKey(String key) {
        return this.store.get(key);
    }

    public boolean keyExists(String key) {
        return this.store.containsKey(key);
    }

    public void removeValueByKey(String key) {
        if (keyExists(key)) {
            this.store.remove(key);
        }
    }

    public void addDBValue(String key, DBValue dbValue, Integer expires) {
        this.store.put(key, dbValue);
        if (expires != null) {
            this.setExpires(key, expires);
        }
    }

    public void setExpires(String key, int expires) {
        database.setExpires(key, expires, this.number);
    }

    public int getNumber() {
        return this.number;
    }

    public IDatabase getDatabase() {
        return database;
    }
}
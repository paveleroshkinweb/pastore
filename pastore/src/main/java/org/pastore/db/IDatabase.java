package org.pastore.db;

import org.pastore.db.store.Store;
import org.pastore.handle.factory.IHandlerFactory;

import java.io.Closeable;

public interface IDatabase extends Closeable {

    Store getStoreByIndex(int index);

    void setExpires(String key, int expires, int storeNumber);

    default void shutdownTimers() {}

    int getStoresNumber();

    IHandlerFactory getHandlerFactory();
}

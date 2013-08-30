package org.keycloak.services.models.nosql.api.types;

/**
 * SPI object to convert object from application type to database type and vice versa. Shouldn't be directly used by application.
 * Various converters should be registered in TypeConverter, which is main entry point to be used by application
 *
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public interface Converter<T, S> {

    T convertDBObjectToApplicationObject(S dbObject);

    S convertApplicationObjectToDBObject(T applicationObject);

    Class<? extends T> getApplicationObjectType();

    Class<S> getDBObjectType();
}

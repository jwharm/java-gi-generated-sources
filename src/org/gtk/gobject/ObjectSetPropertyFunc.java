package org.gtk.gobject;

@FunctionalInterface
public interface ObjectSetPropertyFunc {

        void onObjectSetPropertyFunc(Object object, int propertyId, Value value);
}

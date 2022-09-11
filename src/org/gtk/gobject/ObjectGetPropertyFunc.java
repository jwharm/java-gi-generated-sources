package org.gtk.gobject;

@FunctionalInterface
public interface ObjectGetPropertyFunc {

        void onObjectGetPropertyFunc(Object object, int propertyId, Value value);
}

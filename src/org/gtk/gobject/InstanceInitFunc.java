package org.gtk.gobject;

@FunctionalInterface
public interface InstanceInitFunc {

        void onInstanceInitFunc(TypeInstance instance);
}

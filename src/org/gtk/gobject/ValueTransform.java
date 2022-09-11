package org.gtk.gobject;

@FunctionalInterface
public interface ValueTransform {

        void onValueTransform(Value srcValue);
}

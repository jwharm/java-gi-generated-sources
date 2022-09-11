package org.gtk.gobject;

@FunctionalInterface
public interface BindingTransformFunc {

        void onBindingTransformFunc(Binding binding, Value fromValue, Value toValue);
}

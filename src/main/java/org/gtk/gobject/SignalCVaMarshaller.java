package org.gtk.gobject;

/**
 * This is the signature of va_list marshaller functions, an optional
 * marshaller that can be used in some situations to avoid
 * marshalling the signal argument into GValues.
 */
public interface SignalCVaMarshaller extends org.gtk.gobject.VaClosureMarshal {
}

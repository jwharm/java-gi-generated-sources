package org.gtk.gdk;

@FunctionalInterface
public interface ContentDeserializeFunc {

    /**
     * The type of a function that can be registered with gdk_content_register_deserializer().
     * 
     * When the function gets called to operate on content, it can call functions on the
     * @deserializer object to obtain the mime type, input stream, user data, etc. for its
     * operation.
     */
    public void onContentDeserializeFunc(ContentDeserializer deserializer);
}

package org.gtk.gdk;

/**
 * The type of a function that can be registered with gdk_content_register_serializer().
 * 
 * When the function gets called to operate on content, it can call functions on the
 * @serializer object to obtain the mime type, output stream, user data, etc. for its
 * operation.
 */
@FunctionalInterface
public interface ContentSerializeFunc {
        void onContentSerializeFunc(ContentSerializer serializer);
}

package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.CClosure} is a specialization of {@link org.gtk.gobject.Closure} for C function callbacks.
 */
public class CClosure extends io.github.jwharm.javagi.ResourceBase {

    public CClosure(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * A {@link org.gtk.gobject.ClosureMarshal} function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     */
    public static void marshalBOOLEANBOXEDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__BOXED_BOXED().
     */
    public static void marshalBOOLEANBOXEDBOXEDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the <code>#gint</code> parameter
     * denotes a flags type.
     */
    public static void marshalBOOLEANFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__FLAGS().
     */
    public static void marshalBOOLEANFLAGSv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_BOOLEAN__FLAGSv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)</code>.
     */
    public static void marshalSTRINGOBJECTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_STRING__OBJECT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_STRING__OBJECT_POINTER().
     */
    public static void marshalSTRINGOBJECTPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_STRING__OBJECT_POINTERv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDBOOLEAN(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOOLEAN(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOOLEAN().
     */
    public static void marshalVOIDBOOLEANv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__BOOLEANv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOXED().
     */
    public static void marshalVOIDBOXEDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__BOXEDv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gchar arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__CHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__CHAR().
     */
    public static void marshalVOIDCHARv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__CHARv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDDOUBLE(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__DOUBLE(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__DOUBLE().
     */
    public static void marshalVOIDDOUBLEv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__DOUBLEv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the <code>#gint</code> parameter denotes an enumeration type..
     */
    public static void marshalVOIDENUM(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ENUM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ENUM().
     */
    public static void marshalVOIDENUMv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__ENUMv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the <code>#gint</code> parameter denotes a flags type.
     */
    public static void marshalVOIDFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLAGS().
     */
    public static void marshalVOIDFLAGSv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__FLAGSv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDFLOAT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLOAT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLOAT().
     */
    public static void marshalVOIDFLOATv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__FLOATv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__INT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__INT().
     */
    public static void marshalVOIDINTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__INTv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, glong arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDLONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__LONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__LONG().
     */
    public static void marshalVOIDLONGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__LONGv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDOBJECT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__OBJECT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__OBJECT().
     */
    public static void marshalVOIDOBJECTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__OBJECTv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDPARAM(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__PARAM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__PARAM().
     */
    public static void marshalVOIDPARAMv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__PARAMv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__POINTER().
     */
    public static void marshalVOIDPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__POINTERv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDSTRING(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__STRING(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__STRING().
     */
    public static void marshalVOIDSTRINGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__STRINGv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, guchar arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDUCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UCHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UCHAR().
     */
    public static void marshalVOIDUCHARv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__UCHARv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, guint arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDUINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)</code>.
     */
    public static void marshalVOIDUINTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT_POINTER().
     */
    public static void marshalVOIDUINTPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__UINT_POINTERv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT().
     */
    public static void marshalVOIDUINTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__UINTv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gulong arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDULONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ULONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ULONG().
     */
    public static void marshalVOIDULONGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__ULONGv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)</code>.
     */
    public static void marshalVOIDVARIANT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VARIANT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VARIANT().
     */
    public static void marshalVOIDVARIANTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__VARIANTv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A marshaller for a {@link org.gtk.gobject.CClosure} with a callback of type<code>void (*callback) (gpointer instance, gpointer user_data)</code>.
     */
    public static void marshalVOIDVOID(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VOID(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * The {@link org.gtk.gobject.VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VOID().
     */
    public static void marshalVOIDVOIDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_VOID__VOIDv(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * A generic marshaller function implemented via
     * {@link [libffi]}(http://sourceware.org/libffi/).
     * 
     * Normally this function is not passed explicitly to g_signal_new(),
     * but used automatically by GLib when specifying a <code>null</code> marshaller.
     */
    public static void marshalGeneric(Closure closure, Value returnGvalue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_generic(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A generic {@link org.gtk.gobject.VaClosureMarshal} function implemented via
     * {@link [libffi]}(http://sourceware.org/libffi/).
     */
    public static void marshalGenericVa(Closure closure, Value returnValue, TypeInstance instance, VaList argsList, jdk.incubator.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        gtk_h.g_cclosure_marshal_generic_va(closure.handle(), returnValue.handle(), instance.handle(), argsList, marshalData, nParams, Interop.allocateNativeArray(paramTypes).handle());
    }
    
    /**
     * Creates a new closure which invokes @callback_func with @user_data as
     * the last parameter.
     * 
     * @destroy_data will be called as a finalize notifier on the {@link org.gtk.gobject.Closure}
     */
    public static Closure new_(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new closure which invokes @callback_func with @user_data as
     * the first parameter.
     * 
     * @destroy_data will be called as a finalize notifier on the {@link org.gtk.gobject.Closure}
     */
    public static Closure newSwap(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new_swap(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

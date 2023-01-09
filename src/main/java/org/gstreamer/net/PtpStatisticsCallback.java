package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The statistics can be the following structures:
 * <p>
 * GST_PTP_STATISTICS_NEW_DOMAIN_FOUND:
 * "domain"                G_TYPE_UINT          The domain identifier of the domain
 * "clock"                 GST_TYPE_CLOCK       The internal clock that is slaved to the
 *                                              PTP domain
 * <p>
 * GST_PTP_STATISTICS_BEST_MASTER_CLOCK_SELECTED:
 * "domain"                G_TYPE_UINT          The domain identifier of the domain
 * "master-clock-id"       G_TYPE_UINT64        PTP clock identifier of the selected master
 *                                              clock
 * "master-clock-port"     G_TYPE_UINT          PTP port number of the selected master clock
 * "grandmaster-clock-id"  G_TYPE_UINT64        PTP clock identifier of the grandmaster clock
 * <p>
 * GST_PTP_STATISTICS_PATH_DELAY_MEASURED:
 * "domain"                G_TYPE_UINT          The domain identifier of the domain
 * "mean-path-delay-avg"   GST_TYPE_CLOCK_TIME  Average mean path delay
 * "mean-path-delay"       GST_TYPE_CLOCK_TIME  Latest mean path delay
 * "delay-request-delay"   GST_TYPE_CLOCK_TIME  Delay of DELAY_REQ / DELAY_RESP messages
 * <p>
 * GST_PTP_STATISTICS_TIME_UPDATED:
 * "domain"                G_TYPE_UINT          The domain identifier of the domain
 * "mean-path-delay-avg"   GST_TYPE_CLOCK_TIME  Average mean path delay
 * "local-time"            GST_TYPE_CLOCK_TIME  Local time that corresponds to ptp-time
 * "ptp-time"              GST_TYPE_CLOCK_TIME  Newly measured PTP time at local-time
 * "estimated-ptp-time"    GST_TYPE_CLOCK_TIME  Estimated PTP time based on previous measurements
 * "discontinuity"         G_TYPE_INT64         Difference between estimated and measured PTP time
 * "synced"                G_TYPE_BOOLEAN       Currently synced to the remote clock
 * "r-squared"             G_TYPE_DOUBLE        R² of clock estimation regression
 * "internal-time"         GST_TYPE_CLOCK_TIME  Internal time clock parameter
 * "external-time"         GST_TYPE_CLOCK_TIME  External time clock parameter
 * "rate-num"              G_TYPE_UINT64        Internal/external rate numerator
 * "rate-den"              G_TYPE_UINT64        Internal/external rate denominator
 * "rate"                  G_TYPE_DOUBLE        Internal/external rate
 * <p>
 * If {@code false} is returned, the callback is removed and never called again.
 */
/**
 * Functional interface declaration of the {@code PtpStatisticsCallback} callback.
 */
@FunctionalInterface
public interface PtpStatisticsCallback {

    /**
     * The statistics can be the following structures:
     * <p>
     * GST_PTP_STATISTICS_NEW_DOMAIN_FOUND:
     * "domain"                G_TYPE_UINT          The domain identifier of the domain
     * "clock"                 GST_TYPE_CLOCK       The internal clock that is slaved to the
     *                                              PTP domain
     * <p>
     * GST_PTP_STATISTICS_BEST_MASTER_CLOCK_SELECTED:
     * "domain"                G_TYPE_UINT          The domain identifier of the domain
     * "master-clock-id"       G_TYPE_UINT64        PTP clock identifier of the selected master
     *                                              clock
     * "master-clock-port"     G_TYPE_UINT          PTP port number of the selected master clock
     * "grandmaster-clock-id"  G_TYPE_UINT64        PTP clock identifier of the grandmaster clock
     * <p>
     * GST_PTP_STATISTICS_PATH_DELAY_MEASURED:
     * "domain"                G_TYPE_UINT          The domain identifier of the domain
     * "mean-path-delay-avg"   GST_TYPE_CLOCK_TIME  Average mean path delay
     * "mean-path-delay"       GST_TYPE_CLOCK_TIME  Latest mean path delay
     * "delay-request-delay"   GST_TYPE_CLOCK_TIME  Delay of DELAY_REQ / DELAY_RESP messages
     * <p>
     * GST_PTP_STATISTICS_TIME_UPDATED:
     * "domain"                G_TYPE_UINT          The domain identifier of the domain
     * "mean-path-delay-avg"   GST_TYPE_CLOCK_TIME  Average mean path delay
     * "local-time"            GST_TYPE_CLOCK_TIME  Local time that corresponds to ptp-time
     * "ptp-time"              GST_TYPE_CLOCK_TIME  Newly measured PTP time at local-time
     * "estimated-ptp-time"    GST_TYPE_CLOCK_TIME  Estimated PTP time based on previous measurements
     * "discontinuity"         G_TYPE_INT64         Difference between estimated and measured PTP time
     * "synced"                G_TYPE_BOOLEAN       Currently synced to the remote clock
     * "r-squared"             G_TYPE_DOUBLE        R² of clock estimation regression
     * "internal-time"         GST_TYPE_CLOCK_TIME  Internal time clock parameter
     * "external-time"         GST_TYPE_CLOCK_TIME  External time clock parameter
     * "rate-num"              G_TYPE_UINT64        Internal/external rate numerator
     * "rate-den"              G_TYPE_UINT64        Internal/external rate denominator
     * "rate"                  G_TYPE_DOUBLE        Internal/external rate
     * <p>
     * If {@code false} is returned, the callback is removed and never called again.
     */
    boolean run(byte domain, org.gstreamer.gst.Structure stats);
    
    @ApiStatus.Internal default int upcall(byte domain, MemoryAddress stats, MemoryAddress userData) {
        var RESULT = run(domain, org.gstreamer.gst.Structure.fromAddress.marshal(stats, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PtpStatisticsCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}

package org.gtk.gio;

/**
 * This callback type is used by g_file_measure_disk_usage() to make
 * periodic progress reports when measuring the amount of disk spaced
 * used by a directory.
 * <p>
 * These calls are made on a best-effort basis and not all types of
 * {@link File} will support them.  At the minimum, however, one call will
 * always be made immediately.
 * <p>
 * In the case that there is no support, {@code reporting} will be set to
 * {@code false} (and the other values undefined) and no further calls will be
 * made.  Otherwise, the {@code reporting} will be {@code true} and the other values
 * all-zeros during the first (immediate) call.  In this way, you can
 * know which type of progress UI to show without a delay.
 * <p>
 * For g_file_measure_disk_usage() the callback is made directly.  For
 * g_file_measure_disk_usage_async() the callback is made via the
 * default main context of the calling thread (ie: the same way that the
 * final async result would be reported).
 * <p>
 * {@code current_size} is in the same units as requested by the operation (see
 * {@link FileMeasureFlags#APPARENT_SIZE}).
 * <p>
 * The frequency of the updates is implementation defined, but is
 * ideally about once every 200ms.
 * <p>
 * The last progress callback may or may not be equal to the final
 * result.  Always check the async result to get the final value.
 */
@FunctionalInterface
public interface FileMeasureProgressCallback {
        void onFileMeasureProgressCallback(boolean reporting, long currentSize, long numDirs, long numFiles);
}

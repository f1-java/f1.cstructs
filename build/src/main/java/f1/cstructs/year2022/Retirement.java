// Generated by jextract

package f1.cstructs.year2022;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Retirement {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("vehicleIdx")
    ).withName("Retirement");
    public static MemoryLayout $LAYOUT() {
        return Retirement.$struct$LAYOUT;
    }
    static final VarHandle vehicleIdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vehicleIdx"));
    public static VarHandle vehicleIdx$VH() {
        return Retirement.vehicleIdx$VH;
    }
    public static byte vehicleIdx$get(MemorySegment seg) {
        return (byte)Retirement.vehicleIdx$VH.get(seg);
    }
    public static void vehicleIdx$set( MemorySegment seg, byte x) {
        Retirement.vehicleIdx$VH.set(seg, x);
    }
    public static byte vehicleIdx$get(MemorySegment seg, long index) {
        return (byte)Retirement.vehicleIdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vehicleIdx$set(MemorySegment seg, long index, byte x) {
        Retirement.vehicleIdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}



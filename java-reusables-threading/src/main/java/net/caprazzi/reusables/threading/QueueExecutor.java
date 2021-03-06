package net.caprazzi.reusables.threading;

import com.google.common.util.concurrent.ListenableFuture;
import net.caprazzi.reusables.common.Managed;

public interface QueueExecutor<TElement> extends Managed {
    public ListenableConfirmation enqueue(TElement element);
    public int size();
}

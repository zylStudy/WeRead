package cn.read.ui.interactor;

import cn.read.listener.RequestCallBack;
import rx.Subscription;

/**
 * Created by lw on 2017/1/15.
 */

public interface PhotosInteractor<T> {
    Subscription lodePhotosChannels(RequestCallBack<T> callBack);
}

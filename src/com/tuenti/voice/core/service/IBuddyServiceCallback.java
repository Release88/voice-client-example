/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/stewart/iWork/WebRTC/webrtcjingleproject/trunk/android/voice-client-example/target/unpack/apklibs/com.tuenti.voice_voice-aidl_apklib_1.0-SNAPSHOT/src/com/tuenti/voice/core/service/IBuddyServiceCallback.aidl
 */
package com.tuenti.voice.core.service;
public interface IBuddyServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tuenti.voice.core.service.IBuddyServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.tuenti.voice.core.service.IBuddyServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tuenti.voice.core.service.IBuddyServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.tuenti.voice.core.service.IBuddyServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tuenti.voice.core.service.IBuddyServiceCallback))) {
return ((com.tuenti.voice.core.service.IBuddyServiceCallback)iin);
}
return new com.tuenti.voice.core.service.IBuddyServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_handleBuddyUpdated:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Buddy[] _arg0;
_arg0 = data.createTypedArray(com.tuenti.voice.core.data.Buddy.CREATOR);
this.handleBuddyUpdated(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tuenti.voice.core.service.IBuddyServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void handleBuddyUpdated(com.tuenti.voice.core.data.Buddy[] buddies) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(buddies, 0);
mRemote.transact(Stub.TRANSACTION_handleBuddyUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_handleBuddyUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void handleBuddyUpdated(com.tuenti.voice.core.data.Buddy[] buddies) throws android.os.RemoteException;
}

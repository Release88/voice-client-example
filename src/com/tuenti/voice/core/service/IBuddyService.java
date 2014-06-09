/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/stewart/iWork/WebRTC/webrtcjingleproject/trunk/android/voice-client-example/target/unpack/apklibs/com.tuenti.voice_voice-aidl_apklib_1.0-SNAPSHOT/src/com/tuenti/voice/core/service/IBuddyService.aidl
 */
package com.tuenti.voice.core.service;
public interface IBuddyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tuenti.voice.core.service.IBuddyService
{
private static final java.lang.String DESCRIPTOR = "com.tuenti.voice.core.service.IBuddyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tuenti.voice.core.service.IBuddyService interface,
 * generating a proxy if needed.
 */
public static com.tuenti.voice.core.service.IBuddyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tuenti.voice.core.service.IBuddyService))) {
return ((com.tuenti.voice.core.service.IBuddyService)iin);
}
return new com.tuenti.voice.core.service.IBuddyService.Stub.Proxy(obj);
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
case TRANSACTION_requestBuddyUpdate:
{
data.enforceInterface(DESCRIPTOR);
this.requestBuddyUpdate();
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.service.IBuddyServiceCallback _arg0;
_arg0 = com.tuenti.voice.core.service.IBuddyServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterCallback:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.service.IBuddyServiceCallback _arg0;
_arg0 = com.tuenti.voice.core.service.IBuddyServiceCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tuenti.voice.core.service.IBuddyService
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
@Override public void requestBuddyUpdate() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestBuddyUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerCallback(com.tuenti.voice.core.service.IBuddyServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterCallback(com.tuenti.voice.core.service.IBuddyServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_requestBuddyUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void requestBuddyUpdate() throws android.os.RemoteException;
public void registerCallback(com.tuenti.voice.core.service.IBuddyServiceCallback cb) throws android.os.RemoteException;
public void unregisterCallback(com.tuenti.voice.core.service.IBuddyServiceCallback cb) throws android.os.RemoteException;
}

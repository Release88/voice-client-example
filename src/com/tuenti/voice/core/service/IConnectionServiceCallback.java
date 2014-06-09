/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/stewart/iWork/WebRTC/webrtcjingleproject/trunk/android/voice-client-example/target/unpack/apklibs/com.tuenti.voice_voice-aidl_apklib_1.0-SNAPSHOT/src/com/tuenti/voice/core/service/IConnectionServiceCallback.aidl
 */
package com.tuenti.voice.core.service;
public interface IConnectionServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tuenti.voice.core.service.IConnectionServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.tuenti.voice.core.service.IConnectionServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tuenti.voice.core.service.IConnectionServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.tuenti.voice.core.service.IConnectionServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tuenti.voice.core.service.IConnectionServiceCallback))) {
return ((com.tuenti.voice.core.service.IConnectionServiceCallback)iin);
}
return new com.tuenti.voice.core.service.IConnectionServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_handleLoggingIn:
{
data.enforceInterface(DESCRIPTOR);
this.handleLoggingIn();
return true;
}
case TRANSACTION_handleLoggedIn:
{
data.enforceInterface(DESCRIPTOR);
this.handleLoggedIn();
return true;
}
case TRANSACTION_handleLoggedOut:
{
data.enforceInterface(DESCRIPTOR);
this.handleLoggedOut();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tuenti.voice.core.service.IConnectionServiceCallback
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
@Override public void handleLoggingIn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleLoggingIn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleLoggedIn() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleLoggedIn, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleLoggedOut() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleLoggedOut, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_handleLoggingIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_handleLoggedIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_handleLoggedOut = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void handleLoggingIn() throws android.os.RemoteException;
public void handleLoggedIn() throws android.os.RemoteException;
public void handleLoggedOut() throws android.os.RemoteException;
}

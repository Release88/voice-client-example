/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/stewart/iWork/WebRTC/webrtcjingleproject/trunk/android/voice-client-example/target/unpack/apklibs/com.tuenti.voice_voice-aidl_apklib_1.0-SNAPSHOT/src/com/tuenti/voice/core/service/ICallServiceCallback.aidl
 */
package com.tuenti.voice.core.service;
public interface ICallServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tuenti.voice.core.service.ICallServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.tuenti.voice.core.service.ICallServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tuenti.voice.core.service.ICallServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.tuenti.voice.core.service.ICallServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tuenti.voice.core.service.ICallServiceCallback))) {
return ((com.tuenti.voice.core.service.ICallServiceCallback)iin);
}
return new com.tuenti.voice.core.service.ICallServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_handleCallInProgress:
{
data.enforceInterface(DESCRIPTOR);
this.handleCallInProgress();
return true;
}
case TRANSACTION_handleIncomingCall:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.tuenti.voice.core.data.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.handleIncomingCall(_arg0);
return true;
}
case TRANSACTION_handleIncomingCallAccepted:
{
data.enforceInterface(DESCRIPTOR);
this.handleIncomingCallAccepted();
return true;
}
case TRANSACTION_handleIncomingCallTerminated:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.tuenti.voice.core.data.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.handleIncomingCallTerminated(_arg0);
return true;
}
case TRANSACTION_handleOutgoingCall:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.tuenti.voice.core.data.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.handleOutgoingCall(_arg0);
return true;
}
case TRANSACTION_handleOutgoingCallAccepted:
{
data.enforceInterface(DESCRIPTOR);
this.handleOutgoingCallAccepted();
return true;
}
case TRANSACTION_handleOutgoingCallTerminated:
{
data.enforceInterface(DESCRIPTOR);
com.tuenti.voice.core.data.Call _arg0;
if ((0!=data.readInt())) {
_arg0 = com.tuenti.voice.core.data.Call.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.handleOutgoingCallTerminated(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tuenti.voice.core.service.ICallServiceCallback
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
@Override public void handleCallInProgress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleCallInProgress, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleIncomingCall(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleIncomingCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleIncomingCallAccepted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleIncomingCallAccepted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleIncomingCallTerminated(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleIncomingCallTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleOutgoingCall(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleOutgoingCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleOutgoingCallAccepted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleOutgoingCallAccepted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleOutgoingCallTerminated(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((call!=null)) {
_data.writeInt(1);
call.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_handleOutgoingCallTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_handleCallInProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_handleIncomingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_handleIncomingCallAccepted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_handleIncomingCallTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_handleOutgoingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_handleOutgoingCallAccepted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_handleOutgoingCallTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void handleCallInProgress() throws android.os.RemoteException;
public void handleIncomingCall(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException;
public void handleIncomingCallAccepted() throws android.os.RemoteException;
public void handleIncomingCallTerminated(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException;
public void handleOutgoingCall(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException;
public void handleOutgoingCallAccepted() throws android.os.RemoteException;
public void handleOutgoingCallTerminated(com.tuenti.voice.core.data.Call call) throws android.os.RemoteException;
}

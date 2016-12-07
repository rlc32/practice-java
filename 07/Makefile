# Makefile for GNAT (Ada) version of namer.
TARGET = namer

CC = gcc
CFLAGS = -c -gnata

$(TARGET): $(TARGET).ali
	gnatbind $(TARGET).ali
	gnatlink $(TARGET).ali

	/usr/bin/rm -f $(TARGET).ali $(TARGET).c

$(TARGET).ali: $(TARGET).adb
	$(CC) $(CFLAGS) $(TARGET).adb

clean:
	rm -f $(TARGET) *~ *# *.o *.ali



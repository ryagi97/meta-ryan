# compiler flags
# -g adds debug information to the output
#  -Wall turns on most, but not all, compiler warsings
CFLAGS = -g -Wall

# the name of the target source file and output
TARGET = hello

all: $(TARGET)
	${CC} $(CFLAGS) -o $(TARGET) $(LDFLAGS)  $(TARGET).c

clean:
	rm -f $(TARGET)

# compiler flags
# -g adds debug information to the output
# -Wall turns on most, but not all, compiler warsings
CFLAGS = -g -Wall

# the name of the target source file and output
TARGET = shit-calc
OBJFILES = shit-calc.o calc-func.o

all: $(TARGET)
	
$(TARGET): $(OBJFILES) 
	${CC} $(CFLAGS) -o $(TARGET) $(OBJFILES) $(LDFLAGS)

clean:
	rm -f $(OBJFILES) $(TARGET)

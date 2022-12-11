run: build
	java -cp "./bin/" main.Driver

build: clean
	find -name "*.java" > sources.txt
	javac -source 11 -target 11 -d bin @sources.txt

clean:
	rm -rf bin/
	rm -rf "sources.txt"

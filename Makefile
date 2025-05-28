run: build
	java -cp bin Main

build:
	javac -d bin Main.java

clean:
	rm -r bin

git:
	git config --global user.name "Darlon"
	git config --global user.email "darlonv@gmail.com"


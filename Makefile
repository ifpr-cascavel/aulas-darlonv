run: build
	java -cp bin Main

build:
	javac -d bin Main.java

clean:
	rm -r bin

git:
	git config --global user.name "Darlon"
	git config --global user.email "darlonv@gmail.com"


testAula04:
	#Compilando arquivo de teste
	javac -d bin test/TestAula04.java
	
	#Executando teste
	java -ea -cp bin test/TestAula04


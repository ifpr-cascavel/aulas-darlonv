run: build
	# Executando..
	java -cp bin Main

build:
	# Compilando..
	javac -d bin Main.java

clean:
	# Removendo..
	rm -r bin

git:
	git config --global user.name "Darlon Vasata"
	git config --global user.email "darlonv@gmail.com"


testAula04:
	#Compilando arquivo de teste
	javac -d bin test/TestAula04.java
	
	#Executando teste
	java -ea -cp bin test/TestAula04


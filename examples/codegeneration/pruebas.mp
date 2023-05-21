	call	main
	halt
p:
	enter	0
	ret	0, 0, 0
f:
	enter	5
	push	bp
	pushi	-4
	addi
	pusha	7
	pushi	2
	addi
	loadb
	b2i
	i2f
	pusha	7
	pushi	0
	addi
	loadi
	i2f
	addf
	push	bp
	pushi	4
	addi
	loadf
	addf
	push	bp
	pushi	8
	addi
	loadi
	i2f
	addf
	storef
	push	bp
	pushi	-5
	addi
	pushb	48
	storeb
	push	bp
	pushi	-5
	addi
	loadb
	b2i
	ret	2, 5, 6
fill:
	enter	4
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	8
	addi
	loadi
	storei
Label_1:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	Label_2
	pusha	10
	push	bp
	pushi	4
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	push	bp
	pushi	6
	addi
	loadi
	push	bp
	pushi	-4
	addi
	loadi
	addi
	storei
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	-4
	addi
	loadi
	push	bp
	pushi	8
	addi
	loadi
	addi
	storei
	jmp	Label_1
Label_2:
	ret	0, 4, 6
show:
	enter	2
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
Label_3:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	Label_4
	pushb	40
	outb
	push	bp
	pushi	4
	addi
	loadi
	outi
	pushb	44
	outb
	push	bp
	pushi	-2
	addi
	loadi
	outi
	pushb	41
	outb
	pushb	58
	outb
	pusha	10
	push	bp
	pushi	4
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	loadi
	outi
	pushb	32
	outb
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	Label_3
Label_4:
	pushb	10
	outb
	ret	0, 2, 2
main:
	enter	2
	call	p
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
	pusha	7
	pushi	2
	addi
	pushb	48
	storeb
	pusha	7
	pushi	0
	addi
	pushb	48
	b2i
	storei
	push	bp
	pushi	-2
	addi
	loadi
	i2f
	pusha	7
	pushi	2
	addi
	loadb
	b2i
	call	f
	outi
	pushb	10
	outb
	pushf	1.3
	pushi	2
	call	f
	popi
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
	pusha	4
	pushi	0
	storei
Label_5:
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	lti
	jz	Label_6
	push	bp
	pushi	-2
	addi
	loadi
	pusha	4
	loadi
	pushi	1
	call	fill
	push	bp
	pushi	-2
	addi
	loadi
	call	show
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	pusha	4
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	muli
	storei
	jmp	Label_5
Label_6:
	ret	0, 2, 0

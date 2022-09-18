#lang racket
(define (trafficLight color)
	(cond
		((equal? color "green") (display "It's green\n"))
		((equal? color "yellow") (display "It's yellow!\n"))
		((equal? color "red") (display "stop\n"))
		(else (display "wrong color\n"))
	)
)

(trafficLight "blue")
(trafficLight "green")
# Machine Learning

## Simple Linear Regression 


## Linear Model

$y_i = \beta_0 + \beta_1 x_i + \epsilon$


## Regression Linear 


$\hat{y}_i = \beta_0 + \beta_1 x_i + \epsilon$

## The Loss Function

$\sum\limits_{i=1}^n (y_i - \hat{y}_i)^2$


$\mathcal{E} = \sum\limits_{i=1}^n [y_i - (\beta_0 + \beta_1 x_i)]^2$

## To optimize $\mathcal{E}$ 

1. $\frac{\partial \mathcal{E}}{\beta_0} = 0$


1. $\frac{\partial \mathcal{E}}{\beta_1} = 0$



## The SoLE 


1. $\Large{n\beta_0 + \beta_1 \sum\limits_{i=1}^n} x_i =  \sum\limits_{i=1}^n y_i$


2. $\Large{\beta_0  \sum\limits_{i=1}^n x_i + \beta_1 \sum\limits_{i=1}^n} x^2_i =  \sum\limits_{i=1}^n x_iy_ii$


## The Simple Linear Regression Model


$\beta_0 = \bar{y} + \beta_1 \bar{x}$

$\beta_1 = \frac{n \sum\limits_{i=1}^n x_i y_i -  \sum\limits_{i=1}^n x_i  \sum\limits_{i=1}^n y_i}{n \sum\limits_{i=1}^n x^2_i - \sum\limits_{i=1}^n x_i \sum\limits_{i=1}^n x_i}$


## An OO appproach for implementing the SLR Learning Tech

@startuml
class SLR {
beta_0: double
beta_1: double
regress():[]double
printRegressionEq():[]double
predict():double
}
@enduml


@startuml
class Model {
}
@enduml



@startuml
class Regression {
}
@enduml

@startuml
class Data {
}
@enduml

































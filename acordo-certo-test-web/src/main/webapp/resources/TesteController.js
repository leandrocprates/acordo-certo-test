/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



var myAppModule = angular.module('mainApp', ['ngSanitize']);

myAppModule.controller("oitudobem", function ($scope,$http,$sce)
{
    $scope.person = {firstName:"John Maluco", lastName:"Doe", age:50, eyeColor:"blue"};

    
    $scope.aluno = {
        id: null,
        nome : null , 
        endereco : null , 
        pais : null , 
        habilitado : null 
    };
    
    
    $scope.listaPais = [ 
          {name: 'BRASIL'},
          {name: 'ESTADOS_UNIDOS'},
          {name: 'INGLATERRA'}
         ] ;    
    
    
    $scope.listaUsuarios;
    $scope.mostrarLista=true; 
    
    $scope.chamarListaUsuarios = function(){
        
        var url='http://localhost:8080/acordo-certo-test-web/usuario/buscartudo';
        
        $http.get(url)
                .success(function (data){
                    $scope.listaUsuarios=data;
                    console.log('Busca correta');
                })
                .error(function (data){
                    console.log('Erro na busca ');
                });                
    };
    
    
    $scope.chamarListaUsuarios(); //busca inicial da lista de usuarios 
    
    
    $scope.renderizaformulario = function(){
        $scope.mostrarLista=false; 
    };
    
    $scope.renderizaLista = function(){
        $scope.mostrarLista=true; 
    };

    
    
    
    $scope.salvarUsuario = function(){
        console.log($scope.aluno);
        
        var url='http://localhost:8080/acordo-certo-test-web/usuario/criar';
        
        $http.post(url,$scope.aluno)
                .success(function (data){
                    console.log('Usuario adicionado com sucesso.');
                    $scope.renderizaLista();
                    $scope.chamarListaUsuarios(); 
                })
                .error(function (data){
                    console.log('Erro ao adicionar usuario.');
                });
        
    }
    
    
    $scope.deletarRegistro = function(usuario){
        
        var url='http://localhost:8080/acordo-certo-test-web/usuario/' + usuario.id ;
        
        console.log('Url delete: ' + url );
        
        $http.delete(url)
                .success(function (data){
                    console.log('Usuario deletado com sucesso.');
                })
                .error(function (data){
                    console.log('Erro ao deletar usuario.');
                });
        
    
    
    };    
    
    
    
});
    

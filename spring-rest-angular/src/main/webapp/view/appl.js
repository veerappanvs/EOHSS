var app = angular.module('app', ['ui.grid','ui.grid.pagination']);

app.controller('ApplicationsCtrl', ['$scope','ApplicationsService', function ($scope,ApplicationsService) {
   var paginationOptions = {
     pageNumber: 1,
	 pageSize: 5,
	 sort: null
   };

   ApplicationsService.getApplications(paginationOptions.pageNumber,
		   paginationOptions.pageSize).success(function(data){
	  $scope.gridOptions.data = data.content;
 	  $scope.gridOptions.totalItems = data.totalElements;
   });
   
   $scope.gridOptions = {
    paginationPageSizes: [5, 10, 20],
    paginationPageSize: paginationOptions.pageSize,
    enableColumnMenus:false,
	useExternalPagination: true,
    columnDefs: [
      { name: 'appId', displayName: 'Application ID' },
      { name: 'uniquePDFAppId', displayName: 'PDF Application ID' },
      { name: 'contactPersonId.personName', displayName: 'Org name'  },
      { name: 'fileSubmissionDate', displayName: 'Submission Date' },         
      { name: 'applicationType', displayName: 'Application Type'  }


    ],
    onRegisterApi: function(gridApi) {
        $scope.gridApi = gridApi;
        gridApi.pagination.on.paginationChanged($scope, function (newPage, pageSize) {
          paginationOptions.pageNumber = newPage;
          paginationOptions.pageSize = pageSize;
          ApplicationsService.getApplications(newPage,pageSize).success(function(data){
        	  $scope.gridOptions.data = data.content;
         	  $scope.gridOptions.totalItems = data.totalElements;
          });
        });
     }
  };
  
}]);

app.service('ApplicationsService',['$http', function ($http) {
	
	function getApplications(pageNumber,size) {
		pageNumber = pageNumber > 0?pageNumber - 1:0;
        return  $http({
          method: 'GET',
          url: 'applications/get?page='+pageNumber+'&size='+size
        });
    }
	
    return {
    	getApplications:getApplications
    };
	
}]);
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
     // { name: 'appId', displayName: 'App ID' },
      { name: 'uniquePDFAppId', displayName: 'PDF Application ID' },
      { name: 'applicationType', displayName: 'Application Type'},
      { name: 'contactPersonId.personName', displayName: 'HealthBoard name'  },
      { name: 'fileSubmissionDate', displayName: 'Submission Date' },
    /*  { name: 'workflowStartDate', displayName: 'Recieved Date' },*/
      { name: 'overallWorkflowStatus', displayName: 'Workflow Status'},
/*      { name: 'workflowDetails[0].status', displayName: 'APPROVER_1',  editableCellTemplate: 'uiSelect.html',
																          editDropdownOptionsArray: [
																              'PENDING',
																              'ONHOLD',
																              'APPROVE', 
																              'REJECT'
																            ]},*/
      { name: 'workflowDetails[1].status', displayName: 'APPROVER_1'},
      { name: 'workflowDetails[1].status', displayName: 'APPROVER_2'},
      { name: 'workflowDetails[2].status', displayName: 'APPROVER_3'},
      { name: 'workflowDetails[3].status', displayName: 'APPROVER_3'},
      { name: 'button5', displayName: 'Comments'},
      { name: 'href', displayName: 'Pdf Form', cellTemplate: '<div class="ngCellText" ng-class="col.colIndex()" ng-click="openTab()"><a href="files/CommunityEMSApp.pdf">link</a></div>' }
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
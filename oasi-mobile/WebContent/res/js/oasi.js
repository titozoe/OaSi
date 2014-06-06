
$(function() {

	// ----------- Models
	
	// Profile
	var Profile = Backbone.Model.extend({
		
		defaults: function() {
			return {
				name: "Name..",
				surname: "Surname..",
				profession: "Profession..",
				photo: "res/img/placeHolder.png",
				hirings: new ProfileList(),
				recruitings: new ProfileList(),
				collaborations: new ProfileList()
			};
		} 
		
	});
	
	var ProfileList = Backbone.Collection.extend({
		
		model: Profile,		
		
		localStorage: new Backbone.LocalStorage('profiles-oasi'),
		
		nextOrder: function() {
		     if ( !this.length ) {
		       return 1;
		     }
		     return this.last().get('order') + 1;
		 },

		 comparator: function( profile ) {
		      return profile.get('order');
		 },
		 
		 byProfessionName: function(res) {
			
		}
		
	});
	
		
	
	// ------------- Views
	// Profile detail visualization
	var ProfileView = Backbone.View.extend();
	
	
	// Profile visualization as list item
	var ProfileItemView = Backbone.View.extend({
		
		tagname: "li",
		
		events: {
			"click" : "detail"
		},
		
		// uses underscore for building template
		template: _.template($('#profile-item-template').html()), 
		
		render: function() {
			 this.$el.html(this.template(this.model.attributes));
			  return this;		    
		}
		
	});
	
	
	// SearchView
	
	var ISearchView = Backbone.View.extend({
		
		el: $('#i-search'),
		
		initialize: function() {
			
			  _.bindAll(this, 'render'); // fixes loss of context for 'this' within methods
			  this.input = $('#by-profession-searchbox');

		},
		
		events: {
			"keyup #by-profession-searchbox" : "searchByProfession"
		},
		
		render : function(){
			
		},
		
		searchByProfession : function(evt) {
			if (this.input.val().trim().length < 3){return;}
			setTimeout(function() {
				var research = {"profession" : this.input.val().trim()};
			}, 500);
		}

		
	});
	
	var ISearch = new ISearchVieW();
	
	
});